package com.oops.polymorphisam;

abstract class PythonParent {

	public abstract PythonParent getPy();

}

public class Python extends PythonParent {

	public Python getPy() {

		return new Python();
	}

	public static void main(String[] args) {

	}

}
