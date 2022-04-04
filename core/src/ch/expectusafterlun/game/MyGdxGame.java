package ch.expectusafterlun.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {

	private SpriteBatch batch;
	private Texture img;
	private Sprite sprite;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("pizza.jpg");
		sprite = new Sprite(img);
	}

	@Override
	public void render () {
		// Wipe the screen, so we are working with a blank canvas
		Gdx.gl.glClearColor(1, 1, 1, 1); // White
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		sprite.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
