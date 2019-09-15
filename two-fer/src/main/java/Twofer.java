class Twofer {
    String twofer(String name) {
        var output = name == null ? "you" : name;
        return String.format("One for %s, one for me.", output);
    }
}
