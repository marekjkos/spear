package spear

class Pass {

    String name
    String category
    String type
    
    int usageCount
    
    int priorityLevel
    
    static belongsTo = [user:User]
    
    boolean enabled
    
    static constraints = {
        name maxSize:512, nullable: true 
        category maxSize:512, nullable: true 
        type maxSize:512, nullable: true
    }
}
