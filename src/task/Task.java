package task;

public enum Task {

	HOLIDAY {
		@Override
		public String perform() {

			return "Currently on Annual Leave. Please go find someone else to do it!";
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Holiday";
		}
		
	}, SICKLEAVE {
		@Override
		public String perform() {
			
			return "Not feeling so great. I think I should head home now.";
			
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "On Sick Leave";
		}
		
	}, FILING {
		@Override
		public String perform() {
			
			return "Putting files away. Ah, this is so much fun. Why can't they just stay filed away?";
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Filing";
		}
		
	}, RECEPTION {
		@Override
		public String perform() {
			
			return "Performing Reception tasks. Like answering phones and talking to actual people. I can't talk to the animals - that's only Dolittle";
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Front Desk";
		}
		
	}, PRINTING {
		@Override
		public String perform() {
			
			return "Printing...printing...printing. What a waste of perfectly good paper!";
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Printing";
		}
		
	}, LUNCHTIME {
		@Override
		public String perform() {
			// TODO Auto-generated method stub
			return "Heading on lunch now! Back in about an hour, unless I get a better offer!";
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Lunch";
		}
	};
	
	

	public abstract String perform();
	
	public abstract String toString();
}
