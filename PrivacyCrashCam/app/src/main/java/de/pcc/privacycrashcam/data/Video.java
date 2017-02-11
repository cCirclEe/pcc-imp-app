package de.pcc.privacycrashcam.data;

import java.io.File;

/**
 * @author David Laubenstein
 * Created by David Laubenstein on 1/24/17.
 */

public class Video {
    public static final String PREFIX = "VIDEO_";
    public static final String SUFFIX = "mp4";

    /* #############################################################################################
     *                                  attributes
     * ###########################################################################################*/

    private String name;
    private File encVideoFile;
    private File encMetaFile;
    private File encSymKeyFile;
    private Metadata readableMetadata;

    /* #############################################################################################
     *                                  constructors
     * ###########################################################################################*/

    public Video(String name, File encVideoFile, File encMetaFile, File encSymKeyFile, Metadata readableMetadata) {
        this.name = name;
        this.encVideoFile = encVideoFile;
        this.encMetaFile =  encMetaFile;
        this.readableMetadata = readableMetadata;
        this.encSymKeyFile = encSymKeyFile;
    }

    /* #############################################################################################
     *                                  methods
     * ###########################################################################################*/

    /* #############################################################################################
     *                                  getter/ setter
     * ###########################################################################################*/

    public String getName() {
        return name;
    }

    public String extractTagFromName(String name) {
        if(!name.startsWith(PREFIX)) return name;
        return name.replaceFirst(PREFIX, "");
    }

    public File getEncVideoFile() {
        return encVideoFile;
    }

    public File getEncMetaFile() {
        return encMetaFile;
    }

    public Metadata getReadableMetadata() {
        return readableMetadata;
    }

    public File getEncSymKeyFile() {
        return encSymKeyFile;
    }
}
