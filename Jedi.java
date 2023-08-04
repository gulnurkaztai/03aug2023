public class Jedi {
    private String name;
    private String lightsaberColor;

    public Jedi(String name, String lightsaberColor) {
        this.name = name;
        this.lightsaberColor = lightsaberColor;
    }

    public void setLightsaberColor(String newColor) {
        this.lightsaberColor = newColor;
    }

    public String getName() {
        return name;
    }

    public String getLightsaberColor() {
        return lightsaberColor;
    }

    public static void main(String[] args) {
        Jedi jedi = new Jedi("Obi-Wan Kenobi", "Blue");
        System.out.println("Jedi: " + jedi.getName());
        System.out.println("Initial lightsaber color: " + jedi.getLightsaberColor());

        jedi.setLightsaberColor("Green");
        System.out.println("Modified lightsaber color: " + jedi.getLightsaberColor());
    }
}
