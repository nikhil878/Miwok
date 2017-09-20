package com.example.android.miwok;

/**
 * Created by nikhi on 8/9/2017.
 */

public class Word {
    private String mEnglish;
    private String mMiwok;
    private int mImageId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioId;

    public Word(String defaultTranslation, String miwokTranslation, int audioId) {
                mEnglish = defaultTranslation;
                mMiwok = miwokTranslation;
                mAudioId = audioId;
            }

    public Word(String defaultTranslation, String miwokTranslation, int imageId, int audioId) {
        mEnglish = defaultTranslation;
        mMiwok = miwokTranslation;
        mImageId = imageId;
        mAudioId = audioId;
    }

    public String getDefaultTranslation() {
                return mEnglish;
           }


    public String getMiwokTranslation() {
               return mMiwok;
            }

    public int getImageId()
    {
        return mImageId;
    }

    public int getAudioId(){
        return mAudioId;
    }

    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mEnglish='" + mEnglish + '\'' +
                ", mMiwok='" + mMiwok + '\'' +
                ", mImageId=" + mImageId +
                ", mAudioId=" + mAudioId +
                '}';
    }
}
