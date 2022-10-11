package org.example;


public class Cooking {
    public Cook makeCook(MenuItem menuItem) {
        //  return new Cook("돈까스", 5000);
        Cook cook = new Cook(menuItem);
        return cook;
    }
}
