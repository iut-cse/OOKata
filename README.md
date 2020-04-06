This document is for those who would like to contribute in developing the dashboard. Here is the live dashboard: https://iut-cse.github.io/oo-problem-catalog/.  

There is a Glossary at the bottom of this document. Check that if a term seems unclear.

## Technologies
1. Languages and Libraries
   1. TypeScript
   2. HTML
   3. SCSS
   4. JQuery
   5. Lodash
2. Build System: WebPack and NPM
3. Prefered IDE: VSCode
   1. [Live Server Extension](https://marketplace.visualstudio.com/items?itemName=ritwickdey.LiveServer)
   2. [Markdown All in One](https://marketplace.visualstudio.com/items?itemName=yzhang.markdown-all-in-one)

## Build and develop
Several scripts are already given in `package.json` which should be sufficient to build and run the code.
1. Get the latest code
   1. If not already cloned: `git clone https://github.com/iut-cse/oo-problem-catalog`
   2. Or just pull: `git pull`
2. All development of the dashboard will be done in the `dashboard` branch. Checkout to `dashboard` branch: `git checkout dashboard`.
3. Open the `docs` folder in VSCode. You should have `package.json`, `webpack.config.js`, `README.md` and some other files and folders in your root directory.
4. Install all dependencies: `npm install`. You can use the embedded terminal to run all subsequent commands.
5. Build the system. There are several options:
   1. Development build: `npm run build-d`.
   2. (Prefered) Development build with auto rebuild when files are changed: `npm run build-wd`.
   3. Production build: `npm run build-p`.
   4. Production build with auto rebuild when files are changed: `npm run build-wp`.
   Keep your terminal open when using auto rebuild. You can open multiple embedded terminals at the same time. So no worries.
6. Run: "Live Server" extension will add a "Go Live" button at the bottom-right corner of VSCode. Click that. Page will open in your default browser.
7. Start Coding!

## Developing Widgets
The web page is home to some widgets. To develop a widget, you need to create a subtype of `Widget` interface. If developing a table widget, inheriting the abstract `TableWidget` class can be more useful. Check the `app.ts` file to see how a widget is added to the dashboard.  
Check an existing widget's code to get a better idea.

## List of widgets
1. **Top Problems** (complete): Shows top 10 problems with most points earned.
2. **Top Authors by Points** (Assigned to @sadatbs): Shows top 10 problem authors. The ranking is done by total points earned by the author.
3. **Top Authors by Problem Count** (Not started): Shows top 10 problem authors. The ranking is done by total number of problems created by the author.

Please feel free to suggest additional widgets.

## Glossary
* Point: Difference between _thumbs up_ and _thumbs down_ reactions.
* Widget: A part of the web page where a certain data is visualized.
