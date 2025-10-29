package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Int_Q$;
import CC.$.Q2$_LMNt.Q_Dubl$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Int_Dubl$ extends
		Int_Q$,
		Q_Dubl$
{
	Clas_Rap Class=Init_StRt_Nd(Int_Dubl$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Int_Dubl$(int A,double B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Intg_Dublg$(int[] Ag,double[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Int_Dubl$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Intg_Dublg$(Iterable<Integer> Ag,Iterable<Double> Bg)
		{
			Iterator<Integer> A_Itr=Ag.iterator();
			Iterator<Double> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Int_Dubl$(A_Itr.next(),B_Itr.next());}
		}
}