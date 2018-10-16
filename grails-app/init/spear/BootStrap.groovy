package spear

class BootStrap {

    def init = { servletContext ->
                
        def user1 = new User(uniqueName:'user1_', firstName:'first1_').save()
        def user2 = new User(uniqueName:'user2_', firstName:'first2_').save()
        def user3 = new User(uniqueName:'user3_', lastName:'last3_').save()
        
        def pass1 = new Pass(user:user1).save()
        def pass2 = new Pass(user:user2, name: 'pass2_').save()
        //def pass3 = new Pass(name: 'pass3_').save()  //doesn't work becauase pass 'belogs to' a user
        def pass4 = new Pass(user:user1, name: 'pass4_').save()
        def pass5 = new Pass(user:user1, name: 'pass5_').save()
        
    }
    def destroy = {
    }
}
