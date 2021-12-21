package afterschool;

public class Won2Dollar extends Converter {
      
	@Override
	protected double convert(double val) {
		return val/1200;
	}

	@Override
	protected String getSrcString() {
		return "¿ø";
	}

	@Override
	protected String getDestString() {
		return "´Þ·¯";
	}

}
