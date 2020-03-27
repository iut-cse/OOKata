# OO Problem Catalog
This repository's [issue tracker](https://github.com/iut-cse/oo-problem-catalog/issues) is used as Object Oriented Problem Catalog. **Watch** the repository to get updates, **star** it to make it popular.

### Quick Links
* [Read this before posting a problem](CONTRIBUTING.md)
* [Dashboard (development in progress)](http://iut-cse.github.io/oo-problem-catalog)
* [All problems](https://github.com/iut-cse/oo-problem-catalog/issues)
  * [Sort by popularity](https://github.com/iut-cse/oo-problem-catalog/issues?q=is%3Aissue+is%3Aopen+sort%3Areactions-%2B1-desc)
  * [Very easy](https://github.com/iut-cse/oo-problem-catalog/issues?q=is%3Aopen+is%3Aissue+label%3A%22Very+Easy%22)
  * [Easy](https://github.com/iut-cse/oo-problem-catalog/issues?q=is%3Aopen+is%3Aissue+label%3AEasy)
  * [Medium](https://github.com/iut-cse/oo-problem-catalog/issues?q=is%3Aopen+is%3Aissue+label%3AMedium)
  * [Hard](https://github.com/iut-cse/oo-problem-catalog/issues?q=is%3Aopen+is%3Aissue+label%3AHard)
  * [Very hard](https://github.com/iut-cse/oo-problem-catalog/issues?q=is%3Aopen+is%3Aissue+label%3A%22Very+Hard%22)

---
# Contributing
There are several ways you can contribute:
### Add/Edit/Close problems
[See the contributors' guide](CONTRIBUTING.md)

### Review solutions
Most problems here cannot be automatically validated. Also, there is no one designated to evaluate the solutions. But we hope that a peer review system will be eshtablished within the community. We expect the following people to review other peoples solutions:
   - Comments from industry people will be extremely valuable.
   - Problem creators are possibly the best people to review solutions to the problems they created.
   - People who gave solution to a problem can review solution of other people.
   - Anyone else who feels like checking other peoples solution.  
   Note that by review, we do not mean just leaving comment about the solution. Just asking why this problem is solved this way can be a good source of knowledge.
   You can check the solutions online or you can build yourself. See [_How to check other people's solutions_](#how-to-check-other-peoples-solutions) below. 

### Discuss about the problems
Each of the problems has a comment thread associated with it. Use it to discuss about the problem. Discussion may include (but not limited to):
   - Ask for clarification about the problem.
   - Scope of improvement of the problem description. Better edit the problem yourself, but if you do not feel like editing, comment.
   - Discussion about the solution is OK. **Do not paste the whole solution**. You can give a link of course. Note that if you follow the recommended way to submit a solution ([described below](#submit-solutions)), it will be automatically tagged with the problem.
   - Suggest a different difficulty level.
   - Suggest a different topic tag.
   - Your feeling about the problem. Does the problem make you nostalgic?
   - Anything you like to discuss.

### Rate the problems
Rating the problems will help people to identify which problems they should try. GitHub has several _reactions_, amongh which thumbs up is considered +1 and thumbs down in considered -1. These two will be considered as primary means of popularity count. But you can give additional reactions for appreciation. More than one reaction by the same user is supported.

### Submit solutions
Following is the recommended way to submit a solution.
   * Create a branch with your GitHub username.
   * Create a folder int the `/solutions` folder with your GitHub username. If your username is `abdullah`, the folder should be `/solutions/abdullah`.
   * Write any code in that folder
   * PUSH ONLY TO YOUR BRANCH. Pull requests to master branch will not be reviewed.
   * Mention the issue number in your commit. For example, a commit is for solving issue 1, mention #1 somewhere in the commit. It will be lincked to the problem automatically.
   * For ease of compiling and running your solutions by a reviewer, you should commit with your IDE files. Common ignore list for popular IDEs are already available in the `solutions` folder. Add your additional ignore list within your folder. 
   * If any of the language above seems unfamiliar to you. Just commit and push. You cannot do much harm anyway and no one is going to be mad on you about anything.

---
## How to check other people's solutions
Simplest way to see other people's solutions is to see their branch's code online. However, if you want to build and run their code, you should do the followings:
* Clone/pull the repository.
* Checkout to their branch and the code will be their.
* Please DO NOT COMMIT TO OTHER PEOPLE'S BRANCH.

Note that popular solution providers' branches will be merged to master time to time. Check the `solutions` folder for that.


