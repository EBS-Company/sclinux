#!/bin/bash
#if [ "$1" = "sc" ]
#then
#       echo "hi"
#fi
cd /usr/local/bin
if [ -f $1 ]
then
    mcedit "$1"
else
    echo "#!/bin/bash" > $1
    mcedit "$1"
    if [ -f $1 ]
    then
        chmod +x "$1"
        echo -e "\e[92m|\e[91msc\e[92m|\e[97m Created."
    else
        echo -e "\e[92m|\e[91msc\e[92m|\e[97m Not created."
    fi
fi
