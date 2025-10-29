package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Long_Q$;
import CC.$.Q2$_LMNt.Q_Dubl$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Long_Dubl$ extends
		Long_Q$,
		Q_Dubl$
{
	Clas_Rap Class=Init_StRt_Nd(Long_Dubl$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Long_Dubl$(long A,double B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg_Dublg$(long[] Ag,double[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Long_Dubl$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg_Dublg$(Iterable<Long> Ag,Iterable<Double> Bg)
		{
			Iterator<Long> A_Itr=Ag.iterator();
			Iterator<Double> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Long_Dubl$(A_Itr.next(),B_Itr.next());}
		}
}