class Box {

	private double width;
	private double height;
	private double depth;

	Box(Box ob) { // pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width * height * depth;
	}
}

class BoxWeight extends Box {
	double weight; // weight of box

	BoxWeight(Box ob) { // pass object to constructor
		super(ob);
	}

	public static void main(String args[]) {
		Box mybOX1 = new Box(10, 20, 30);
		new BoxWeight(mybOX1);
		double vol;
		vol = mybOX1.volume();
		System.out.println("Volume of mybox1 is " + vol);
	}
}
