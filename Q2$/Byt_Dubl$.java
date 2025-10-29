package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q2$_LMNt.Byt_Q$;
import CC.$.Q2$_LMNt.Q_Dubl$;
import java.util.Iterator;

public interface Byt_Dubl$ extends
	Byt_Q$,
	Q_Dubl$
{
	Clas_Rap Class=Init_StRt_Nd(Byt_Dubl$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Byt_Dubl$(byte A,double B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg_Dublg$(byte[] Ag,double[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Byt_Dubl$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg_Dublg$(Iterable<Byte> Ag,Iterable<Double> Bg)
		{
			Iterator<Byte> A_Itr=Ag.iterator();
			Iterator<Double> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Byt_Dubl$(A_Itr.next(),B_Itr.next());}
		}
}