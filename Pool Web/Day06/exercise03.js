module.exports = {
    countGs: function(str) {
        var Gs = 0;
        for (var position = 0; position < str.length; position++) {
            if (str.charAt(position) == 'G') {
                Gs += 1;
            }
        }
        return(Gs);
    }
}