module.exports = {
    arrayFiltering: function(array, test) {
        var arr = [];
        for (i = 0; i < array.length; i ++) {
            if (test(array[i]) === true) {
                arr.push(array[i]);;
            }
        }
        return(arr);
    }
}