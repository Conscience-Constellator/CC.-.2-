package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Point_Q$;
import CC.$.Q2$_LMNt.Q_Dubl$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Point_Dubl$<Q_q$_Typ> extends
		Point_Q$<Q_q$_Typ>,
		Q_Dubl$
{
	Clas_Rap Class=Init_StRt_Nd(Point_Dubl$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Point_Dubl$(Q_q$_Typ A,double B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Pointg_Dublg$(Q_q$_Typ[] Ag,double[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Point_Dubl$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Pointg_Dublg$(Iterable<Q_q$_Typ> Ag,Iterable<Double> Bg)
		{
			Iterator<Q_q$_Typ> A_Itr=Ag.iterator();
			Iterator<Double> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Point_Dubl$(A_Itr.next(),B_Itr.next());}
		}
}