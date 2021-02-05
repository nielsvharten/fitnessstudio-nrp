/**
 */
package nrp.model.nrp.provider;

import java.util.ArrayList;
import java.util.Collection;

import nrp.model.nrp.util.NRPAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NRPItemProviderAdapterFactory extends NRPAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NRPItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link nrp.model.nrp.NRP} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NRPItemProvider nrpItemProvider;

	/**
	 * This creates an adapter for a {@link nrp.model.nrp.NRP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNRPAdapter() {
		if (nrpItemProvider == null) {
			nrpItemProvider = new NRPItemProvider(this);
		}

		return nrpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link nrp.model.nrp.Customer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerItemProvider customerItemProvider;

	/**
	 * This creates an adapter for a {@link nrp.model.nrp.Customer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomerAdapter() {
		if (customerItemProvider == null) {
			customerItemProvider = new CustomerItemProvider(this);
		}

		return customerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link nrp.model.nrp.Cost} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostItemProvider costItemProvider;

	/**
	 * This creates an adapter for a {@link nrp.model.nrp.Cost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCostAdapter() {
		if (costItemProvider == null) {
			costItemProvider = new CostItemProvider(this);
		}

		return costItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link nrp.model.nrp.SoftwareArtifact} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareArtifactItemProvider softwareArtifactItemProvider;

	/**
	 * This creates an adapter for a {@link nrp.model.nrp.SoftwareArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareArtifactAdapter() {
		if (softwareArtifactItemProvider == null) {
			softwareArtifactItemProvider = new SoftwareArtifactItemProvider(this);
		}

		return softwareArtifactItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link nrp.model.nrp.Requirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementItemProvider requirementItemProvider;

	/**
	 * This creates an adapter for a {@link nrp.model.nrp.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequirementAdapter() {
		if (requirementItemProvider == null) {
			requirementItemProvider = new RequirementItemProvider(this);
		}

		return requirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link nrp.model.nrp.RequirementRealisation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementRealisationItemProvider requirementRealisationItemProvider;

	/**
	 * This creates an adapter for a {@link nrp.model.nrp.RequirementRealisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequirementRealisationAdapter() {
		if (requirementRealisationItemProvider == null) {
			requirementRealisationItemProvider = new RequirementRealisationItemProvider(this);
		}

		return requirementRealisationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link nrp.model.nrp.Solution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionItemProvider solutionItemProvider;

	/**
	 * This creates an adapter for a {@link nrp.model.nrp.Solution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolutionAdapter() {
		if (solutionItemProvider == null) {
			solutionItemProvider = new SolutionItemProvider(this);
		}

		return solutionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link nrp.model.nrp.Valuation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuationItemProvider valuationItemProvider;

	/**
	 * This creates an adapter for a {@link nrp.model.nrp.Valuation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValuationAdapter() {
		if (valuationItemProvider == null) {
			valuationItemProvider = new ValuationItemProvider(this);
		}

		return valuationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (nrpItemProvider != null)
			nrpItemProvider.dispose();
		if (customerItemProvider != null)
			customerItemProvider.dispose();
		if (costItemProvider != null)
			costItemProvider.dispose();
		if (softwareArtifactItemProvider != null)
			softwareArtifactItemProvider.dispose();
		if (requirementItemProvider != null)
			requirementItemProvider.dispose();
		if (requirementRealisationItemProvider != null)
			requirementRealisationItemProvider.dispose();
		if (solutionItemProvider != null)
			solutionItemProvider.dispose();
		if (valuationItemProvider != null)
			valuationItemProvider.dispose();
	}

}
