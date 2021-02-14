package adminSystemView;

public class UserInformation {
    
        private final String UserName;
    	private final String UserID;
    	private final String UserUsername;
    	private final String UserPassword;
        private final String UserEmailAddress;
        private final String UserGender;
        private final String UserAddress;
        
        public UserInformation(String name, String id, String email, String username, String userpassword, String gender, String useraddress) {
            this.UserName = name;
            this.UserID = id;
            this.UserUsername = username;
            this.UserPassword = userpassword;
            this.UserEmailAddress = email;
            this.UserGender = gender;
            this.UserAddress = useraddress;
        }
        
                    public String getUserName() {
                    return UserName;
            }

            
            public String getUserID() {
                    return UserID;
            }
 
            
            public String getUserUsername() {
                    return UserUsername;
            }


            public String getUserPassword() {
                    return UserPassword;
            }
            
            public String getUserEmailAddress() {
                    return UserEmailAddress;
            }
            
            public String getUserGender() {
                    return UserGender;
            }
            
            public String getUserAddress() {
                    return UserAddress;
            }
}
