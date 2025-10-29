package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Point_Q$;
import CC.$.Q2$_LMNt.Q_Byt$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Point_Byt$<Q_q$_Typ> extends
		Point_Q$<Q_q$_Typ>,
		Q_Byt$
{
	Clas_Rap Class=Init_StRt_Nd(Point_Byt$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Point_Byt$(Q_q$_Typ A,byte B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Pointg_Bytg$(Q_q$_Typ[] Ag,byte[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Point_Byt$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Pointg_Bytg$(Iterable<Q_q$_Typ> Ag,Iterable<Byte> Bg)
		{
			Iterator<Q_q$_Typ> A_Itr=Ag.iterator();
			Iterator<Byte> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Point_Byt$(A_Itr.next(),B_Itr.next());}
		}
}