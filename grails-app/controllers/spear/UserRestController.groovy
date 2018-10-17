package spear
import grails.rest.* 

class UserRestController extends RestfulController<User> {
    static responseFormats = ['json', 'xml']
    UserRestController() {
        super(User)
    }
    
}
