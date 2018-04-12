*** Settings ***
Documentation     A resource file with reusable keywords and variables.
...
...               The system specific keywords created here form our own
...               domain specific language. They utilize keywords provided
...               by the imported Selenium2Library.
Library           Selenium2Library

*** Variables ***
${BROWSER}        Chrome
${DELAY}          1
${GOOGLE URL}     http://www.google.com/
${SELENIUM TEXT}    Selenium - Web Browser Automation
${SELENIUM URL}     https://www.seleniumhq.org/

*** Keywords ***
Open Browser To Google
    Open Browser    ${GOOGLE URL}    ${BROWSER}
    Maximize Browser Window
    Set Selenium Speed    ${DELAY}
    Google Should Be Open

Google Should Be Open
    Title Should Be    Google

Search For
    [Arguments]    ${search term}
    Input Text     lst-ib     ${search term}
    Click Button   Google Search

Click through to Selenium Link
    Click Link      ${SELENIUM TEXT}

Selenium Page Should Be Open
    Location Should Be    ${SELENIUM URL}
    Title Should Be    ${SELENIUM TEXT}