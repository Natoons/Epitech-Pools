module.exports = {
    fizzBuzz: function(nb) {
        msg = "";
        for (var i = 1; i != nb + 1; i++) {
            if (i % 3 == 0) {
                msg += "Fizz";
                if (i % 5 == 0) {
                    msg += "Buzz";
                }
            }
            else if (i % 5 == 0) {
                msg += "Buzz";
            }
            else {
                msg += i;;
            }
            if (i != nb) {
                msg += ", ";
            }
        }
        console.log(msg);
    }
}