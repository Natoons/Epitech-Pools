module.exports = {
    objectsDeeplyEqual: function(cmp1, cmp2) {
        if (cmp1 === cmp2) {
            return true;
        }

        if (cmp2 == null && cmp1 == null) {
            return true;
        }

        if (cmp2 == null || cmp1 == null) {
            return false;
        }

        if (typeof cmp1 != typeof cmp2) {
            
        }
    }
}