module.exports = {
    range: function(start, end, step) {
        let arr = [];
        if (step < 0) {
            for (i = start; i >= end; i += step) {
                let newLength = arr.push(i);
            }
        }
        else if (step > 0) {
            for (i = start; i <= end; i += step) {
                let newLength  = arr.push(i);
            }
        }
        else {
            for (i = start; i <= end; i++) {
                let newLength  = arr.push(i);
            } 
        }
        return(arr);
    }
}