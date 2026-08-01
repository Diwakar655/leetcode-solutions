class Solution {
    public double[] convertTemperature(double cel) {
        double faren =0, kelvin=0;
        kelvin = cel + 273.15;
        faren =(cel*1.80)+32;
        
        return new double[] {kelvin , faren};
        


        
    }
}