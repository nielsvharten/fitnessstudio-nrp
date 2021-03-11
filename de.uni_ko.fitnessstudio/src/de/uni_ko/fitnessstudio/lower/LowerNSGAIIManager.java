package de.uni_ko.fitnessstudio.lower;

import java.util.List;

import org.uma.jmetal.algorithm.Algorithm;
import org.uma.jmetal.algorithm.multiobjective.nsgaii.NSGAIIBuilder;
import org.uma.jmetal.example.AlgorithmRunner;
import org.uma.jmetal.operator.selection.SelectionOperator;
import org.uma.jmetal.operator.selection.impl.BinaryTournamentSelection;
import org.uma.jmetal.solution.Solution;
import org.uma.jmetal.util.JMetalLogger;
import org.uma.jmetal.util.comparator.RankingAndCrowdingDistanceComparator;

public class LowerNSGAIIManager<S> {
	DomainModelProblem<S> problem;
	DomainModelCrossover<DomainModelSolution<S>> crossover;
	DomainModelMutation<S> mutation;
	SelectionOperator<List<DomainModelSolution<S>>, DomainModelSolution<S>> selection;
	
	public LowerNSGAIIManager(DomainModelProblem<S> problem, 
			DomainModelCrossover<DomainModelSolution<S>> crossover, DomainModelMutation<S> mutation) {
		this.problem = problem;
		this.crossover = crossover;
		this.mutation = mutation;
		this.selection = new BinaryTournamentSelection<>(new RankingAndCrowdingDistanceComparator<>());
	}
	
	public void runNSGAII() {
		int populationSize = 100 ;
		
		Algorithm<List<DomainModelSolution<S>>> algorithm = 
				new NSGAIIBuilder<>(problem, crossover, mutation, populationSize)
	            	.setSelectionOperator(selection)
	            	.setMaxEvaluations(250)
	            	.build();

	    AlgorithmRunner algorithmRunner = 
	    		new AlgorithmRunner.Executor(algorithm)
	            	.execute();
	    
	    List<DomainModelSolution<S>> population = algorithm.getResult();
	    long computingTime = algorithmRunner.getComputingTime();

	    JMetalLogger.logger.info("Total execution time: " + computingTime + "ms");
	}
}
