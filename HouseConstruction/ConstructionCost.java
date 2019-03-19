package HouseConstruction;

/**
 *  This program is used to estimate the cost for construction of a house based on the standard materials for a given area.
 *  
 * @author chetana.
 *
 */


public class ConstructionCost
{

		public double cost_per_feet=1;
		public double total_cost;
		
		public double cost(int type_of_material,double area,boolean Automated)
		{
			
			/**
			 * @param type_of_material
			 * @param area
			 * @param Automated
			 *  This method find cost of the material based on users input.
			 * 
			 */
			double cost=0.0;
			
			if(type_of_material==1)
			{
				
				/**
				 * type_of_material==1 represents standard materials.
				 */
				
				cost=1200.00;
			}
			else if(type_of_material==2)
			{
				
				/**
				 * type_of_material==2 represents above standard materials.
				 */
				
				cost=1500.00;
			}
			else if(type_of_material==3)
			{
				
				/**
				 * type_of_material==3 represents high standard materials.
				 */
				
				cost=1800.00;
			}
			else if(type_of_material==4)
			{
				
				/**
				 * type_of_material==3 and Automated==true represents above standard materials with fully automated home.
				 */
				
				cost=2500.00;
			}
			
			/**
			 * returns the total_cost for construction of house.
			 */
			
			return cost*area;
		}
	}