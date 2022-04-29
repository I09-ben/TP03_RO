/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zine dine
 */
import java.util.ArrayList;

import generic.AlgorithmeAbstract;
import generic.Problem;
import generic.SolutionPartielle;
public class Fonction {
    public static void recherche()
    {
        int Sol_initiale[];
		Solution sat = new Solution(Instance p);
	
			Sol_initiale = new int[n];
			for (int j = 0; j < n; j++)
				Sol_initiale[j] = -1;
			int random = (int) (Math.random() * 100) % n;
			double c=Math.random();
			if ( c< 0.5)
				Sol_initiale[random] = 1;
			else
				Sol_initiale[random] = 0;
			sat.setInit(Sol_initiale);
			sat.setFitnes(new Solution().num_clause_satisfied(Sol_initiale,p));
		
		return sat;
    }
    private SolutionPartielle chercherMeilleureSolution(
			ArrayList<SolutionPartielle> liste) {
		SolutionPartielle meilleur = null;
		double max = -1;
		for (SolutionPartielle s : liste) {
			if (this.problemeAResoudre.evaluer(s) >= max) {
				max = this.problemeAResoudre.evaluer(s);
				meilleur = s;
			}
		}
		return meilleur;
	}
    
}
