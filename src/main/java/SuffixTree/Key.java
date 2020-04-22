package SuffixTree;

public class Key {
    String keyValue;
    char character;
    int index;

    public Key(String keyValue, char character, int index) {
        this.keyValue = keyValue;
        this.character = character;
        this.index = index;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}


