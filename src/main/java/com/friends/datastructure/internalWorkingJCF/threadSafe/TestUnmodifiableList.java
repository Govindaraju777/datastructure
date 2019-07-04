package com.friends.datastructure.internalWorkingJCF.threadSafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestUnmodifiableList {
	public static void main(String[] args) {
		List<String> unmodifiable = Collections.unmodifiableList(new ArrayList<>());
	}
}
