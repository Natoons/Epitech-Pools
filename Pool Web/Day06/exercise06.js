module.exports = {
    objectsDeeplyEqual: function(cmp1, cmp2) {

        if (cmp1 == null && cmp2 == null) {
            return true;
        } else if (typeof cmp1 === "object" && typeof cmp2 === "object") {
            isObjectMatch = false;

            for (property1 in cmp1) {
                isPropertyMatch = false;

                for (property2 in cmp2) {
                    if (property1 === property2) {
                        isPropertyMatch = this.objectsDeeplyEqual(cmp1[property1], cmp2[property2]);
                    }
        
                    if(isPropertyMatch){
                        break;
                    }
                }
        
                isObjectMatch  = isPropertyMatch;
        
                if (!isObjectMatch) {
                    break;
                }
            }
    
            return isObjectMatch;

        } else {
            return cmp1 === cmp2;
        }
    }
}