PixelKnot
=========

PixelKnot is an image stego app with old school F5 steganography.

## Development Setup

Follow these steps to setup your development environment:

1. Checkout PixelKnot git repository
2. Init and update git submodules

    cd PixelKnot
    git submodule update --init --recursive

3. Import Project

   **Using Eclipse**

    Create a new Eclipse workspace in the root directory (PixelKnot) of the repository.

    For each of the following directories, "Import -> Android -> Existing Android Code Into Workspace":

        external/ActionBarSherlock/library/
        external/F5Android/

    Build the F5Android JNI library with `ndk-build -C external/F5Android/`.
    
    Then, "Import -> General -> Existing Projects Into Workspace" for the `app/` directory.

## Building from the terminal

The nightly builds and the final release builds are made from the terminal
using `ant` and `ndk-build`.  Here's how it is done:

0. git clone https://github.com/guardianproject/PixelKnot
1. cd PixelKnot
2. git submodule update --init --recursive
3. ./setup-ant.sh
4. ndk-build -C external/F5Android/
5. cd app/
6. ant clean debug
