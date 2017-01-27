package de.pcc.privacycrashcam.gui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import de.pcc.privacycrashcam.R;
import de.pcc.privacycrashcam.applicationlogic.VideosFragment;

/**
 * @author David Laubenstein
 *         Created by David Laubenstein on 1/27/17.
 */

public class VideosActivity extends ContainerActivity{
    private Fragment videosFragment;

    /**
     * Starts a new intent with the {@link VideosActivity VideosActivity}
     *
     * @param calling the activity which is doing this call
     */
    public static void Launch(Activity calling){
        Intent intent = new Intent(calling, VideosActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        calling.startActivity(intent);

    }

    @Override
    protected Fragment selectFragment() {
        videosFragment = new VideosFragment();
        return videosFragment;
    }

    @Override
    public int getMenuEntryId() {
        return R.id.nav_recorded;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}