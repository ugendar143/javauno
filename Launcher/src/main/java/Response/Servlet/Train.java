package Response.Servlet;

public class Train {
      private int trainId;
      private String trainName;
      private String departure;
      private String arrival;

	public Train() {
		super();
		
	}
 
	
	public int getTrainId() {
		return trainId;
	}


	public String getTrainName() {
		return trainName;
	}


	public String getDeparture() {
		return departure;
	}


	public String getArrival() {
		return arrival;
	}


	@Override
	public String toString() {
		return " \nTrain [trainId=" + trainId + ", trainName=" + trainName + ", departure=" + departure + ", arrival="
				+ arrival + "]";
	}

	public Train(int trainId, String trainName, String departure, String arrival) {
		super();
		this.trainId = trainId;
		this.trainName = trainName;
		this.departure = departure;
		this.arrival = arrival;
	}
}