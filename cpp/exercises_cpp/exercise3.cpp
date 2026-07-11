#include <iostream>

struct testing_lang {
    std::string message;
    bool result;
};

testing_lang authorize_transaction(double balance, double amount)
{
    std::string output;
    bool result;
    if (amount <= 0)
    {
        output = "Error: Invalid Transaction Amount.";
        result = false;
    }
    else if ((amount > balance) || (balance < 100))
    {
        output = "Transaction Declined: Insufficient Funds or Low Balance Fee.";
        result = false;
    }
    else
    {
        output = "Transaction Approved.";
        result = true;
    }
    return {output, result};
}

int main()
{
    double bal, amo;
    std::cout << "Enter Balance: ";
    std::cin >> bal;
    std::cout << "Enter Amount: ";
    std::cin >> amo;
    testing_lang res = authorize_transaction(bal, amo);
    if (res.result)
    {
        std::cout << res.message;
    }
}
