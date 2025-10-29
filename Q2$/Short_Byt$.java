package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q2$_LMNt.Byt_Q$;
import CC.$.Q2$_LMNt.Q_Byt$;
import java.util.Iterator;

public interface Short_Byt$ extends
	Byt_Q$,
	Q_Byt$
{
	Clas_Rap Class=Init_StRt_Nd(Short_Byt$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Short_Byt$(short A,byte B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg_Bytg$(short[] Ag,byte[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Short_Byt$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg_Bytg$(Iterable<Short> Ag,Iterable<Byte> Bg)
		{
			Iterator<Short> A_Itr=Ag.iterator();
			Iterator<Byte> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Short_Byt$(A_Itr.next(),B_Itr.next());}
		}
}