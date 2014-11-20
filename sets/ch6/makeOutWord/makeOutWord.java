public String makeOutWord(String out, String word)
{
    String side1 = out.substring(0,2);
    String side2 = out.substring(2,4);

    return side1 + word + side2;
}
