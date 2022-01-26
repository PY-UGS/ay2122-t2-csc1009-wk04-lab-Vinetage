/*Class*/
/*Includes private containers*/
/*Public methods*/
public class BMI {
    //Private containers (Height and Weight)
    private double weight;
    private double height;

    //Constructor
    public BMI(){}
    //Overload Constructors
    public BMI(double weight, double height)
    {
        this.weight = weight;
        this.height = height;
    }

    //Setter
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }

    //Getter
    public double getWeight()
    {
        return this.weight;
    }
    public double getHeight()
    {
        return this.height;
    }

    //Conversion weight
    private double convertWeight()
    {
        return (this.weight * 0.45359237);
    }
    //Conversion height
    private double convertHeight()
    {
        return (this.height * 0.0254);
    }
    //BMI
    public double getBMI()
    {
        return (convertWeight()/Math.pow(convertHeight(),2));
    }
    public String getInterpretation()
    {
        //Temp to store values
        String temp = "";
        double bmi = getBMI();

        //If else to get string
        if(bmi < 18.5)
        {
            temp = "Underweight";
        }
        else if(bmi >= 18.5 && bmi < 25)
        {
            temp = "Normal";
        }
        else if(bmi >= 25 && bmi < 30)
        {
            temp = "Overweight";
        }
        else
        {
            temp = "Overweight";
        }

        //Return Value
        return temp;
    }
}
