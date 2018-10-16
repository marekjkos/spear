package spear

class User {
    static hasMany = [passes: Pass]
    //static mappedBy = [passes: "type"]
    
    String uniqueName
    String firstName
    String lastName

    static constraints = {
        uniqueName unique: true, blank: false, nullable:false, size: 1..128
        firstName nullable:true
        lastName nullable:true
    }
    
    String toString() {
        uniqueName
    }
}
