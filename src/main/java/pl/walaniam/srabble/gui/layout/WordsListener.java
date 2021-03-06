package pl.walaniam.srabble.gui.layout;

import pl.walaniam.srabble.gui.actions.WordsChangedEvent;

public interface WordsListener {

    /**
     * Fired when Words object stored by MainFrame has been changed.
     * 
     * @param e
     */
    void wordsChanged(WordsChangedEvent e);
}
