package task4.Entities;

public class Campaing {
	private int id;	
	private String campaignCode;
	private double discountRate;
	
	public Campaing(int id, String campaignCode, int discountRate) {
		super();
		this.id = id;
		this.campaignCode = campaignCode;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

}
