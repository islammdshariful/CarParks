package adminSystemView;


public class Carlist {
        private final String MemberName;
    	private final String MemberID;
    	private final String MemberCarName;
        private final String MemberCarModel;
        private final String MemberCarID;
        private final String MemberCarColour;
        private final String ParkingTime;
        private final String SlotTime;
        private final String SlotNumber;

        public Carlist(String SlotNumber,String name, String id,String carid, String carname, String carmodel, String carcolour, String time1, String time2) {
            this.SlotNumber = SlotNumber;
            this.MemberName = name;
            this.MemberID = id;
            this.MemberCarID = carid;
            this.MemberCarName = carname;
            this.MemberCarModel = carmodel;
            this.MemberCarColour = carcolour;
            this.ParkingTime = time1;
            this.SlotTime = time2;
        }
        
        public String getSlotNumber() {
                return SlotNumber;
        }
          
        public String getMemberName() {
                return MemberName;
        }


        public String getMemberID() {
                return MemberID;
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

        public String getParkingTime() {
                return ParkingTime;
        }

        public String getSlotTime() {
                return SlotTime;
        }
}
