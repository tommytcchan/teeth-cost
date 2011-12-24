package com.teethcost;

import android.app.Activity;
import android.os.Bundle;

/**
 * Class that brings up the review screen for a choice and lists the plan number and the costs involved.
 * The user can then start over again or accept in which case it will add to their plan.
 * @author tchan
 *
 */
public class Wizard3Review extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wizard2);

	}
}
