package com.toad.cardgame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class GameSuccessActivity extends Activity {
    private Button btnRestart;
    private TextView tvFinalScore;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gamesuccess);
		int score = getIntent().getIntExtra("score", 0);
		tvFinalScore = (TextView) findViewById(R.id.tvFinalScore);
		tvFinalScore.setText(this.getResources().getString(R.string.final_score) + score);
		btnRestart = (Button) findViewById(R.id.btnRestart);
		btnRestart.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				MainActivity.getMainActivity().getGameView().startGame();
				finish();
			}
		});
	}
}
