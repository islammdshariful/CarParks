
package adminSystemView;


public class UnverifiedMember {
    private final String MemberName;
    	private final String MemberID;
    	private final String MemberEmailAddress;
    	private final String MemberCarName;
        private final String MemberCarModel;
        private final String MemberCarID;
        private final String MemberCarColour;

        public UnverifiedMember(String name, String id, String email, String carname, String carid, String carmodel, String carcolour) {
            this.MemberName = name;
            this.MemberID = id;
            this.MemberEmailAddress = email;
            this.MemberCarID = carid;
            this.MemberCarName = carname;
            this.MemberCarModel = carmodel;
            this.MemberCarColour = carcolour;
        }
          
            public String getMemberName() {
                    return MemberName;
            }

            
            public String getMemberID() {
                    return MemberID;
            }
 

            
            public String getMemberEmailAddress() {
                    return MemberEmailAddress;
            }


            public String getMemberCarID() {
                    return MemberCarID;
            }
            
            public String getMemberCarName() {
                    return MemberCarName;
            }
            
            public String getMemberCarModel() {
                    return MemberCarModel;
            }
            
            public String getMemberCarColour() {
                    return MemberCarColour;
            }
}

