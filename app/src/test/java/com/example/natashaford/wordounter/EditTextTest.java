package com.example.natashaford.wordounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by natashaford on 03/07/2017.
 */

public class EditTextTest {

    Sentence edit;
    Sentence edit2;

    @Before
    public void before(){
        edit = new Sentence("Hello there");
        edit2 = new Sentence("Hello. Is it me you are looking for?");
    }

    @Test
    public void testGetSentence() throws Exception {
        assertEquals("Hello there", edit.getSentence());
    }

    @Test
    public void testGetWordCount() throws Exception {
        assertEquals(0, edit.getWordCount());
    }

    @Test
    public void testSetWordCount() throws Exception {
        edit.setWordCount();
        assertEquals(2, edit.getWordCount());
    }

    @Test
    public void testSetWordCountLonger() throws Exception {
        edit2.setWordCount();
        assertEquals(8, edit2.getWordCount());
    }

}
