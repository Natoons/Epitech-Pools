window.onload = function() {
    divs = document.getElementsByTagName("div");

    class Hero {
        constructor(name, classes, intelligence, strength) {
            this.name = name;
            this.classes = classes;
            this.intelligence = intelligence;
            this.strength = strength;
        }

        toString(){
            divs[2].innerHTML += "I am " + this.name + " the " + this.classes + ", I have " + this.intelligence + " intelligence points and " + this.strength + " strength points" + "<br>" ;
        }
    }

    var mage = new Hero("amadeus", "mage", 10, 3);
    var warrior = new Hero("pontius", "warrior", 1, 8);
    mage.toString();
    warrior.toString();
}