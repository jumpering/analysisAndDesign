package mastermindDocumentViewFactoryMethod.models;

public enum Color {
    RED('r'),
    BLUE('b'),
    YELLOW('y'),
    ORANGE('o'),
    PINK('p'),
    GREEN('g');

    private char keyword;

    private Color(char keyword) {

        this.keyword = keyword;
    }

    public static Color valueOf(char character) {
        for (Color color : values()) {
            if (color.keyword == character) {
                return color;
            }
        }
        return null;
    }

    public static boolean isValidColor(char character){
        if (valueOf(character) == null){
            return false;
        }
        return true;
    }

    public char getKeyword(){
        return this.keyword;
    }
}