#!/bin/bash

# turns on bluetooth if not already on
bluetoothctl power on &>/dev/null
# stores the name of the target device to a variable
target=$(bluetoothctl info "$2" | grep "Name: ")
# trims the whitespace and removes the prefix
target="${target//[[:space:]]Name: /}"

case "$1" in
    # connect to the target device
    # reconnects if already connected
    "combined")
        # checks if the device to connect is already connected
        if bluetoothctl info "$2" | grep -q "Connected: yes"; then
            # sends a notification that the device is already connected
            notify-send -i "bluetooth" -a "Bluetooth auto-pair" "$target already connected." "Reconnecting to the device."
            # disconnects the device
            bluetoothctl disconnect "$2" &>/dev/null
            # connects to the target device
            bluetoothctl connect "$2" &>/dev/null
        elif bluetoothctl info "$2" | grep -q "Connected: no"; then
            # sends a notification initiating the connectiom to the target
            notify-send -i "bluetooth" -a "Bluetooth auto-pair" "Connecting to $target..." "Please wait for a few seconds."
            # pairs using bluetoothctl
            bluetoothctl connect "$2" &>/dev/null
            # disconnects to the device
                # sometimes, audio comes out at max volume
                # reconnecting fixes this issue
            bluetoothctl disconnect "$2" &>/dev/null
            # connects to the device again
            bluetoothctl connect "$2" &>/dev/null

            # checks if the device is not connected
            if ! bluetoothctl info "$2" | grep -q "Connected: yes"; then
                # sends a notification returning an error wherein the device failed to connect
                notify-send -i "bluetooth" -a "Bluetooth auto-pair" "Unable to connect to $target." "Are both devices turned on?" 
                exit 1
            fi
        # connects to target device if not connected
        else
            # sends a notification returning an error wherein the devices is not found
            notify-send -i "bluetooth" -a "Bluetooth auto-pair" "$2 Not available." "Is there a typo with the device?"
            exit 1
        fi
    ;;
    "connect")
        # checks if the device to connect is already connected
        if bluetoothctl info "$2" | grep -q "Connected: yes"; then
            # sends a notification that the device is already connected
            notify-send -i "bluetooth" -a "Bluetooth auto-pair" "$target already connected." "No need to auto-connect."
        elif bluetoothctl info "$2" | grep -q "Connected: no"; then
            # sends a notification initiating the connectiom to the target
            notify-send -i "bluetooth" -a "Bluetooth auto-pair" "Connecting to $target..." "Please wait for a few seconds."
            # pairs using bluetoothctl
            bluetoothctl connect "$2" &>/dev/null
            # disconnects to the device
                # sometimes, audio comes out at max volume
                # reconnecting fixes this issue
            bluetoothctl disconnect "$2" &>/dev/null
            # connects to the device again
            bluetoothctl connect "$2" &>/dev/null

            # checks if the device is not connected
            if ! bluetoothctl info "$2" | grep -q "Connected: yes"; then
                # sends a notification returning an error wherein the device failed to connect
                notify-send -i "bluetooth" -a "Bluetooth auto-pair" "Unable to connect to $target." "Are both devices turned on?" 
                exit 1
            fi
        # connects to target device if not connected
        else
            # sends a notification returning an error wherein the devices is not found
            notify-send -i "bluetooth" -a "Bluetooth auto-pair" "$2 Not available." "Is there a typo with the device?"
            exit 1
        fi
    ;;
    "reconnect")
        if bluetoothctl info "$2" | grep -q "Connected: yes"; then
            # disconnects the device
            bluetoothctl disconnect "$2" &>/dev/null
            # connects to the target device
            bluetoothctl connect "$2" &>/dev/null
        else
            # sends a notification that the device is not connected, it cannot be reconnected
            notify-send -i "bluetooth" -a "Bluetooth auto-pair" "$2 is not connected." "Cannot reconnect to device."
            exit 1
        fi
    ;;
    "disconnect")
        if bluetoothctl info "$2" | grep -q "Connected: yes"; then
            # disconnects the device
            bluetoothctl disconnect "$2" &>/dev/null
        else
            # sends a notification that the device is not connected, it cannot be disconnected
            notify-send -i "bluetooth" -a "Bluetooth auto-pair" "$2 is not connected." "Cannot disconnect to device."
            exit 1
        fi
    ;;
    *)
        # returns an error code when an invalid option is made
        exit 1
    ;;
esac