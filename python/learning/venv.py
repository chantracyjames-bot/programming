# virtual environment (venv)
#   - an isolated environment in python
#       - used to run and test Python projects
#   - enables managing of project specific dependencies (projects)
#       - all while not interfering with other projects' dependencies
#       - or the original Python installation
#   - analogy:
#       - a virtual environment is a separate container for each Python project
#           - each container has its own Python interpreter (similar to compilers)
#           - it has it's own set of installed packages
#               - can have different versions of the same package
#           - all while being isolated from other containers
#   - importance:
#       - it prevents package conflicts between projects
#       - allows projects to be more portable and reproducible
#       - keeps the original Python installation to be clean
#       - allows testing with different Python versions
#
#   - creating a virtual environment
#       - done through the terminal
#       - syntax:
#           python -m venv <venv_name>
#       - example:
#           pythom -m venv my_project
#       - initial file structure:
#           <venv_name>
#             |--> bin
#             |--> include
#             |--> lib
#             |--> lib64
#             |--> .gitignore
#             \--> pyvenv.cfg
#   - acticating the virtual environment is done with a command
#       - syntax:
#           #> on Linux/macOS
#           <venv_path>/bin/activate
#           #> on Windows
#           <venv_path>\Scripts\activate
#       - after activation, it is not possible to install packages independent of the original Python
#   - deactivating the virtual environment is done with a command
#       - syntax:
#           deactivate
#       - note that all modules that were installed in the virtual environment won't exist outside it
