package theOnlyPackage;

import java.awt.Rectangle;

public class Tree {
	int x;
	int y;
	int width;
	int height;
	boolean isSelected;
	Rectangle box;
	boolean firstTime = true;

	Tree(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		isSelected = false;
		box = new Rectangle(x, y, width, height);
	}

}